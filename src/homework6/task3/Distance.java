package homework6.task3;

public class Distance {
    double distance;

    void print() {
        System.out.println("Kilometers Into Miles " + Converter.convertKilometersIntoMiles(distance) + " ml");
        System.out.println("Kilometers Into Feet " + Converter.convertKilometersIntoFeet(distance) + " ft");
        System.out.println("Kilometers Into Yards " + Converter.convertKilometersIntoYards(distance) + " yr");
        System.out.println("Miles Into Kilometers " + Converter.convertMilesIntoKilometers(distance) + " km");
        System.out.println("Feet Into Kilometers " + Converter.convertFeetIntoKilometers(distance) + " km");
        System.out.println("Miles Into Kilometers " + Converter.convertYardsIntoKilometers(distance) + " km");


    }

    static class Converter {
        static double convertKilometersIntoMiles(double kilometers) {
            return kilometers / 1.609;
        }

        static double convertMilesIntoKilometers(double miles) {
            return miles * 1.609;
        }

        static double convertFeetIntoKilometers(double feet) {
            return feet / 3281;
        }

        static double convertKilometersIntoFeet(double kilometers) {
            return kilometers * 3281;
        }

        static double convertKilometersIntoYards(double kilometers) {
            return kilometers * 1094;
        }

        static double convertYardsIntoKilometers(double yards) {
            return yards / 1094;
        }
    }
}
