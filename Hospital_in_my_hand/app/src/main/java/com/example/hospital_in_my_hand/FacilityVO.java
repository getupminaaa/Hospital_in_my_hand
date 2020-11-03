package com.example.hospital_in_my_hand;

public class FacilityVO {
    String title;
    String content;
    int roodID;
    int coordinateX;
    int coordinateY;
    int floorNumber;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRoodID() {
        return roodID;
    }

    public void setRoodID(int roodID) {
        this.roodID = roodID;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public FacilityVO(String title, String content, int roodID, int coordinateX, int coordinateY, int floorNumber) {
        this.title = title;
        this.content = content;
        this.roodID = roodID;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.floorNumber = floorNumber;
    }
}
