package peaksoft.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Timer() {
    }

    public Long getTime() {
        return nanoTime;
    }
}
