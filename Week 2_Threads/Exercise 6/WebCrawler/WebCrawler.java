import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class WebCrawler {
    private static final int NUM_THREADS = 10;
    private static final ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
    private static final ConcurrentHashMap<String, Boolean> crawledPages = new ConcurrentHashMap<>();
    private static final AtomicInteger pagesCrawled = new AtomicInteger(0);

    public static void main(String[] args) {
        String[] urls = {"http://example.com", "http://example.org", "http://example.net"}; // Sample URLs

        for (String url : urls) {
            executorService.submit(new CrawlerTask(url));
        }

        // Shutdown executor service
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(1, TimeUnit.MINUTES)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("Total pages crawled: " + pagesCrawled.get());
    }

    public static class CrawlerTask implements Runnable {
        private final String url;

        public CrawlerTask(String url) {
            this.url = url;
        }

        @Override
        public void run() {
            try {
                if (!crawledPages.containsKey(url)) {
                    System.out.println("Crawling: " + url);
                    // Simulate web page retrieval
                    Thread.sleep(2000); // Simulate network delay
                    crawledPages.put(url, true);
                    pagesCrawled.incrementAndGet();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
