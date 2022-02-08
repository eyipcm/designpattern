package com.aypc.chainmethod1;

public class Car {

    public enum Color { white, red, green, blue, black };

    private final String brand;
    private final String name;
    private final Color color;
    private final int speed;

    private Car( CarBuilder builder ){
        this.brand = builder.brand;
        this.color = builder.color;
        this.speed = builder.speed;
        this.name = builder.name;
    }

    public static CarBuilder with() {
        return DEFAULT;
    }

    private static final CarBuilder DEFAULT = new CarBuilder(
            null, null, Color.white, 130
    );

    public static class CarBuilder {

        final String brand;
        final String name;
        final Color color;
        final int speed;

        private CarBuilder( String brand, String name, Color color, int speed ) {
            this.brand = brand;
            this.name = name;
            this.color = color;
            this.speed = speed;
        }
        public CarBuilder brand( String newBrand ) {
            return new CarBuilder( newBrand, name, color, speed );
        }
        public CarBuilder name( String newName ) {
            return new CarBuilder( brand, newName, color, speed );
        }
        public CarBuilder color( Color newColor ) {
            return new CarBuilder( brand, name, newColor, speed );
        }
        public CarBuilder speed( int newSpeed ) {
            return new CarBuilder( brand, name, color, newSpeed );
        }
        public Car build() {
            return new Car( this );
        }
    }
    
    @Override
	public String toString() {
		return "Car [brand=" + brand + ", name=" + name + ", color=" + color + ", speed=" + speed + "]";
	}

	public static void main( String [] args ) {

        Car porsche = Car.with()
                .brand( "Porsche" )
                .name( "Carrera" )
                .color( Color.red )
                .speed( 270 )
                .build()
                ;

        // -- or with one default builder
        CarBuilder ASSEMBLY_LINE = Car.with()
                .brand( "Jeep" )
                .name( "Cherokee" )
                .color( Color.green )
                .speed( 180 )
                ;

        ASSEMBLY_LINE.build();
        System.out.println(porsche.toString());
        
        // -- or with custom default builder:
        CarBuilder MERCEDES = Car.with()
        		.brand( "Mercedes" )
        		.color( Color.black )
                ;

        Car c230 = MERCEDES.name( "C230" ).speed( 180 ).build(),
            clk = MERCEDES.name( "CLK" ).speed( 240 ).build();
        System.out.println(c230.toString());
        System.out.println(clk.toString());

    }
}

/*
Car [brand=Porsche, name=Carrera, color=red, speed=270]
Car [brand=Mercedes, name=C230, color=black, speed=180]
Car [brand=Mercedes, name=CLK, color=black, speed=240]
*/
