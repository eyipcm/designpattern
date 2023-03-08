package com.aypc.behavioral.chain;

/*
 * 
class Handler {
    private static final Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;

    public boolean execute(int num) {
        if (RANDOM.nextInt(4) != 0) {
            System.out.println("   " + id + "-busy  ");
            return false;
        }
        System.out.println(id + "-handled-" + num);
        return true;
    }
}

public class ChainDemo {
    public static void main(String[] args) {
        Handler[] nodes = {new Handler(), new Handler(),
                new Handler(), new Handler()};
        for (int i = 1, j; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            j = 0;
            while (!nodes[j].execute(i)) {
                j = (j + 1) % nodes.length;
            }
            System.out.println();
        }
    }
}

 */

public class ChainDemo {
	public static void main(String[] args) {
		Handler rootChain = new Handler();
		rootChain.add(new Handler());
		rootChain.add(new Handler());
		rootChain.add(new Handler());
		rootChain.wrapAround(rootChain);
		for (int i = 1; i < 6; i++) {
			System.out.println("Operation #" + i + ":");
			rootChain.execute(i);
			System.out.println();
		}
	}
}

/*
class Handler {
private final static Random RANDOM = new Random();
private static int nextID = 1;
private int id = nextID++;
private Handler nextInChain;

public void add(Handler next) {
    if (nextInChain == null) {
        nextInChain = next;
    } else {
        nextInChain.add(next);
    }
}

public void wrapAround(Handler root) {
    if (nextInChain == null) {
        nextInChain = root;
    } else {
        nextInChain.wrapAround(root);
    }
}

public void execute(int num) {
    if (RANDOM.nextInt(4) != 0) {
        System.out.println("   " + id + "-busy  ");
        nextInChain.execute(num);
    } else {
        System.out.println(id + "-handled-" + num);
    }
}
}

public class ChainDemo {
public static void main(String[] args) {
    Handler rootChain = new Handler();
    rootChain.add(new Handler());
    rootChain.add(new Handler());
    rootChain.add(new Handler());
    rootChain.wrapAround(rootChain);
    for (int i = 1; i < 6; i++) {
        System.out.println("Operation #" + i + ":");
        rootChain.execute(i);
        System.out.println();
    }
}
}
*/