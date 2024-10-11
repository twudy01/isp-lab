package isp.lab10.racedemo;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class CarRace {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();
        SemaphorePanel semaphorePanel = new SemaphorePanel();

        frame.setLayout(new GridLayout(1, 2));
        frame.setSize(1200, 300);
        frame.getContentPane().add(carPanel);
        frame.getContentPane().add(semaphorePanel);

        frame.pack();
        frame.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();

        Car car1 = new Car("Red car", carPanel, semaphorePanel);
        Car car2 = new Car("Blue car", carPanel, semaphorePanel);
        Car car3 = new Car("Green car", carPanel, semaphorePanel);
        Car car4 = new Car("Yellow car", carPanel, semaphorePanel);
        semaphoreThread.join();
        car1.start();
        car2.start();
        car3.start();
        car4.start();
    }
}

class Car extends Thread {
    private String name;
    private int distance = 0;
    private CarPanel carPanel;
    private SemaphorePanel semaphorePanel;

    public Car(String name, CarPanel carPanel, SemaphorePanel semaphorePanel) {
        setName(name);
        this.name = name;
        this.carPanel = carPanel;
        this.semaphorePanel = semaphorePanel;
    }

    public void run() {
        try {
            // Wait until the semaphore turns green
            while (!semaphorePanel.isGreen()) {
                Thread.sleep(500);
            }

            // Start moving the car once the semaphore is green
            while (distance < 400) {
                // simulate the car moving at a random speed
                int speed = (int) (Math.random() * 10) + 1;
                distance += speed;

                carPanel.updateCarPosition(name, distance);

                try {
                    // pause for a moment to simulate the passage of time
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            carPanel.carFinished(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CarPanel extends JPanel {
    private int[] carPositions;
    private String[] carNames;
    private Color[] carColors;
    private long[] finishTimes; // Array to store finish times

    public CarPanel() {
        carPositions = new int[4];
        carNames = new String[]{"Red car", "Blue car", "Green car", "Yellow car"};
        carColors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
        finishTimes = new long[4]; // Initialize finish times array
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 4; i++) {
            int yPos = 50 + i * 50; // Vertical position of the car
            int xPos = carPositions[i]; // Horizontal position of the car
            int carSize = 30; // Size of the car

            g.setColor(carColors[i]);
            g.fillOval(xPos, yPos, carSize, carSize);
            g.setColor(Color.BLACK);
            g.drawString(carNames[i], xPos, yPos - 5);
        }
    }

    public void updateCarPosition(String carName, int distance) {
        int carIndex = getCarIndex(carName);
        if (carIndex != -1) {
            carPositions[carIndex] = distance;
            repaint();
        }
    }

    public void carFinished(String carName) {
        int carIndex = getCarIndex(carName);
        if (carIndex != -1) {
            finishTimes[carIndex] = System.currentTimeMillis(); // Record finish time
            System.out.println(carName + " finished race.");
            checkForWinner();
        }
    }

    private int getCarIndex(String carName) {
        for (int i = 0; i < 4; i++) {
            if (carNames[i].equals(carName)) {
                return i;
            }
        }
        return -1;
    }

    private void checkForWinner() {
        int winnerIndex = -1;
        long minFinishTime = Long.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            if (finishTimes[i] > 0 && finishTimes[i] < minFinishTime) {
                minFinishTime = finishTimes[i];
                winnerIndex = i;
            }
        }

        if (winnerIndex != -1) {
            double raceTimeInSeconds = (minFinishTime - finishTimes[0]) / 1000.0; // Calculate race time in seconds
            DecimalFormat df = new DecimalFormat("#.##");
            double carRaceTimeInSeconds = (minFinishTime - finishTimes[winnerIndex]) / 1000.0; // Calculate race time for the winning car
            JOptionPane.showMessageDialog(this,
                    carNames[winnerIndex] + " wins the race!\nRace Time: " + df.format(carRaceTimeInSeconds) + " seconds",
                    "Race Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}





