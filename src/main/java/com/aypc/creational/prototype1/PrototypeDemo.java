package com.aypc.creational.prototype1;

import java.util.ArrayList;
import java.util.List;

/*
1 Create a "contract" with clone() and getName() entries
2 Design a "registry" that maintains a cache of prototypical objects
3 Populate the registry with an initializePrototypes() function
4 The registry has a findAndClone() "virtual constructor" that can transform a String into its correct object (it calls clone() which then calls "new")
5 All classes relate themselves to the clone() contract
6 Client uses the findAndClone() virtual ctor instead of the "new" operator
 * */
public class PrototypeDemo {
	public static void main(String[] args) {
		if (args.length > 0) {
			initializePrototypes();
			List<Prototype> prototypes = new ArrayList<>();
			// 6. Client does not use "new"
			for (String protoName : args) {
				Prototype prototype = PrototypeModule.createPrototype(protoName);
				if (prototype != null) {
					prototypes.add(prototype);
				}
			}
			for (Prototype p : prototypes) {
				p.execute();
			}
		} else {
			System.out.println("Run again with arguments of command string ");
		}
	}

	// 3. Populate the "registry"
	public static void initializePrototypes() {
		PrototypeModule.addPrototype(new PrototypeAlpha());
		PrototypeModule.addPrototype(new PrototypeBeta());
		PrototypeModule.addPrototype(new ReleasePrototype());
	}
}
/*
//1. The clone() contract
interface Prototype {
 Prototype clone();
 String getName();
 void execute();
}

class PrototypeModule {
 // 2. "registry" of prototypical objs
 private static List<Prototype> prototypes = new ArrayList<>();

 // Adds a feature to the Prototype attribute of the PrototypesModule class
 // obj  The feature to be added to the Prototype attribute
 public static void addPrototype(Prototype p) {
     prototypes.add(p);
 }

 public static Prototype createPrototype(String name) {
     // 4. The "virtual ctor"
     for (Prototype p : prototypes) {
         if (p.getName().equals(name)) {
             return p.clone();
         }
     }
     System.out.println(name + ": doesn't exist");
     return null;
 }
}

//5. Sign-up for the clone() contract.
//Each class calls "new" on itself FOR the client.
class PrototypeAlpha implements Prototype {
 private String name = "AlphaVersion";

 @Override
 public Prototype clone() {
     return new PrototypeAlpha();
 }

 @Override
 public String getName() {
     return name;
 }

 @Override
 public void execute() {
     System.out.println(name + ": does something");
 }
}

class PrototypeBeta implements Prototype {
 private String name = "BetaVersion";

 @Override
 public Prototype clone() {
     return new PrototypeBeta();
 }

 @Override
 public String getName() {
     return name;
 }

 @Override
 public void execute() {
     System.out.println(name + ": does something");
 }
}

class ReleasePrototype implements Prototype {
 private String name = "ReleaseCandidate";
 @Override
 public Prototype clone() {
     return new ReleasePrototype();
 }

 @Override
 public String getName() {
     return name;
 }

 @Override
 public void execute() {
     System.out.println(name + ": does real work");
 }
}

public class PrototypeDemo {
 public static void main(String[] args) {
     if (args.length > 0) {
         initializePrototypes();
         List<Prototype> prototypes = new ArrayList<>();
         // 6. Client does not use "new"
         for (String protoName : args) {
             Prototype prototype = PrototypeModule.createPrototype(protoName);
             if (prototype != null) {
                 prototypes.add(prototype);
             }
         }
         for (Prototype p : prototypes) {
             p.execute();
         }
     } else {
         System.out.println("Run again with arguments of command string ");
     }
 }

 // 3. Populate the "registry"
 public static void initializePrototypes() {
     PrototypeModule.addPrototype(new PrototypeAlpha());
     PrototypeModule.addPrototype(new PrototypeBeta());
     PrototypeModule.addPrototype(new ReleasePrototype());
 }
}
*/