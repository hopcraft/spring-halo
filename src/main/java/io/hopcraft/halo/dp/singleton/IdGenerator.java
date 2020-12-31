package io.hopcraft.halo.dp.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private AtomicInteger id = new AtomicInteger(0);

    private static final ConcurrentHashMap<Long, IdGenerator> instances = new ConcurrentHashMap<>();

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IdGenerator());
        return instances.get(currentThreadId);
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("生成ID: %d\n", IdGenerator.getInstance().getId());
        }
    }
}
