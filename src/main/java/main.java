public class main {

    /**
     * @param args: Accepts -t (number of threads), -n (Name of Server), -p Port Number, -l (Number of Locks)
     */
    public static void main(String args[]) throws IllegalArgumentException {

        if (args.length == 0) //no args passed start as normal
            defaultConfig();
        int x = 0;
        while (x < args.length - 1) {
            switch (x) {
                
            }
        }


    }

    /**
     * Creates a webserver with a default of
     * Threads: 10
     * Locks: 5
     * Port Number: 9438
     * Name: My Web Server
     */

    private static void defaultConfig() {

    }

    private void configServer(int threads, String name) {

    }


    private static void printIllegalArgs() {
        System.out.println("Usage: [-t] Threads, [-n] Name of Server, [-p] Port Number, [-l] Number of Locks");
    }
}
