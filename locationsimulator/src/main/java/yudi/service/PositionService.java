package yudi.service;

import yudi.model.CurrentPosition;

/**
 *
 *
 *
 */
public interface PositionService {

    void processPositionInfo(long id,
                             CurrentPosition currentPosition,
                             boolean exportPositionsToKml,
                             boolean sendPositionsToIngestionSerice);

}
