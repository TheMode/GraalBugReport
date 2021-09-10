package fr.themode.report;

import net.minestom.server.utils.chunk.ChunkUtils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0, 30000).forEach(v -> {
            final long[] updatedVisibleChunks = ChunkUtils.getChunksInRange(0, 0, 2);
            boolean has = Arrays.stream(updatedVisibleChunks).anyMatch(value -> value == ChunkUtils.getChunkIndex(0, -1));
            if (!has) {
                System.out.println("Not found " + Arrays.toString(updatedVisibleChunks));
                System.exit(0);
            }
        });
        System.out.println("All good!");
    }
}
