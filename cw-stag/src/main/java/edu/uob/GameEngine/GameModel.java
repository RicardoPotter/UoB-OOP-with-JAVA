package edu.uob.GameEngine;

import com.alexmerz.graphviz.ParseException;
import edu.uob.ConfigFileReader.*;
import edu.uob.GameEntities.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class GameModel {
    private HashMap<String, Location> locations;
    private String startingLocation;

    public GameModel(File dotFile) throws FileNotFoundException, ParseException {
        DotReader reader = new DotReader(dotFile);
        this.locations = reader.getLocationList();
        this.startingLocation = reader.getStartingLocation();
    }

}
