package labSheet5.exercise1.exercise3;

public class Thermometer {
    private int currentTemp;
    private int maxTemp;
    private int minTemp;

    public Thermometer() {

        currentTemp =0;
        maxTemp= Integer.MIN_VALUE;
        minTemp=Integer.MAX_VALUE;

    }

    public Thermometer(int currentTemp) {

        setCurrentTemp(currentTemp);
        setMaxTemp(currentTemp);
        setMinTemp(currentTemp);
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void setTemperature(int currentTemp){
        this.currentTemp = currentTemp;
        updateMaxMinTemp(currentTemp);

        }
        private void updateMaxMinTemp(int currentTemp){
        if(currentTemp > maxTemp)
            maxTemp = currentTemp;
        if(currentTemp < minTemp)
            minTemp = currentTemp;
    }

    public String toString() {

        return "Current Temperature" + getCurrentTemp() + "\nMaximum temperature" + getMaxTemp() + "\nMinimum temperature" + getMinTemp();
    }

}