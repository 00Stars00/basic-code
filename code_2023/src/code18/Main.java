package code18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tirePressure = new int[4];
        for (int i = 0; i < 4; i++) {
            tirePressure[i] = scanner.nextInt();
        }
        int minPressure = scanner.nextInt();
        int pressureDifference = scanner.nextInt();
        Tyre tyre = new Tyre(tirePressure, minPressure, pressureDifference);
        tyre.alert();
    }
}

class Tyre {
    private final int[] tirePressure;
    private final int minPressure;
    private final int pressureDifference;

    public Tyre(int[] tirePressure, int minPressure, int pressureDifference) {
        this.tirePressure = tirePressure;
        this.minPressure = minPressure;
        this.pressureDifference = pressureDifference;
    }

    public void alert() {
        difference();
        int count = 0;
        for (int i : tirePressure) {
            if (i == -1) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Normal");
        } else if (count == 1) {
            for (int i = 0; i < tirePressure.length; i++) {
                if (tirePressure[i] == -1) {
                    System.out.println("Warning: please check #" + (i + 1) + "!");
                    break;
                }
            }
        } else {
            System.out.println("Warning: please check all the tires!");
        }
    }

    public int avgPressure() {
        return maxPressure() - pressureDifference;
    }

    private int minPressure() {
        int min = tirePressure[0];
        for (int i : tirePressure) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private int maxPressure() {
        int max = tirePressure[0];
        for (int i : tirePressure) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public void difference() {
        for (int i = 0; i < tirePressure.length; i++) {
            if (tirePressure[i] - avgPressure()<0 || tirePressure[i] < minPressure) {
                tirePressure[i] = -1;
            }
        }
    }
}
