package com.xworkz.bikeshowroom.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BikeShowRoomDTO implements Serializable {

private	String brand;
private	String ownerName;
private	String location;
private	String ambossader;
private	String description;
}
