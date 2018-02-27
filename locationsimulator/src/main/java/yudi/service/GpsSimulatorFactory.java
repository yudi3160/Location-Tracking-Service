package yudi.service;

import yudi.model.GpsSimulatorRequest;
import yudi.model.Point;
import yudi.task.GpsSimulator;

import java.io.File;
import java.util.List;

/**
 *
 *
 */

public interface GpsSimulatorFactory {

    GpsSimulator prepareGpsSimulator(GpsSimulatorRequest gpsSimulatorRequest);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, File kmlFile);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, List<Point> points);

}
