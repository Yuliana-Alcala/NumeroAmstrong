package dev.numeroamstrong;

import views.Index;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Index index = new Index();
        index.captureNumber();
        
    }
}
