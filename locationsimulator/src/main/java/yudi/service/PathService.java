package yudi.service;

import yudi.model.DirectionInput;
import yudi.model.Point;
import yudi.model.ServiceLocation;
import yudi.model.SimulatorFixture;

import java.io.File;
import java.util.List;

/**
 *
 *
 *
 */
public interface PathService {

    /**
     * @return
     */
    List<DirectionInput> loadDirectionInput();

    SimulatorFixture loadSimulatorFixture();

    /**
     * @param directionInput
     * @return
     */
    List<Point> getCoordinatesFromGoogle(DirectionInput directionInput);

    String getCoordinatesFromGoogleAsPolyline(DirectionInput directionInput);


//    List<Point> getCoordinatesFromKmlFile(File kmlFile);

    List<ServiceLocation> getServiceStations();
}
