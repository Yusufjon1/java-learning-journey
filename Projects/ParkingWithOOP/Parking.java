package Projects.ParkingWithOOP;

import java.util.Arrays;

public class Parking {

    private Row[] rows;
    private String parkName;

    public Row[] getRows() {
        return rows;
    }

    public void setRows(Row[] rows) {
        this.rows = rows;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public Parking() {
    }

    @Override
    public String toString() {
        return "Parking{" +
                "rows=" + Arrays.toString(rows) +
                ", parkName='" + parkName + '\'' +
                '}';
    }

    public void buildPark(int rowCount, int cellCount) {
        rows = new Row[rowCount];
        for (int i = 0; i < rowCount; i++) {
            Row row = new Row(i);
            row.buildRow(cellCount);
            rows[i] = row;

        }
    }

    public void displayPark() {

        for (Row row : rows) {
            for (Cell cell : row.getCells()) {
                System.out.printf("%s \t", cell.getSign());
            }
            System.out.println("\n");

        }
    }


    public boolean park(Car car, String carType, String rowNumber, String columnNumber) {
        carType = CarType.findCarByName(carType);
        int rIndex = Integer.parseInt(rowNumber);
        int cIndex = Integer.parseInt(columnNumber);
        Row row = rows[rIndex];
        Cell[] cells = row.getCells();
        Cell cell = cells[cIndex];
        if (cell.getCar() != null) {
            return false;
        }
        cell.setSign(carType);
        cell.setCar(car);
        return true;
    }

    public int getAvailableCellsCount() {
        int count = 0;
        for (Row row : rows) {
            for (Cell cell : row.getCells()) {
                if (cell.getCar() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getOccupiedCellsCount() {
        int totalCells = rows.length * rows[0].getCells().length;
        int occupiedCells = totalCells - getAvailableCellsCount();
        return occupiedCells;
    }

    public boolean unpark(String carNumber) {
        for (Row row : rows) {
            for (Cell cell : row.getCells()) {
                if (cell.getCar() != null && cell.getCar().getCarNumber().equals(carNumber)) {
                       cell.setCar(null);
                       cell.setSign(CarType.EMPTY_SIGN);
                       return true;
                   }
                }
            }
        return false;
        }
    }

