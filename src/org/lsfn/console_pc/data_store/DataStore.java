package org.lsfn.console_pc.data_store;

import org.lsfn.console_pc.data_store.sinks.ISinkBoolean;
import org.lsfn.console_pc.data_store.sinks.ISinkDouble;
import org.lsfn.console_pc.data_store.sinks.ISinkInteger;
import org.lsfn.console_pc.data_store.sinks.ISinkListPoint;
import org.lsfn.console_pc.data_store.sinks.ISinkPoint;
import org.lsfn.console_pc.data_store.sinks.ISinkPolygon;
import org.lsfn.console_pc.data_store.sinks.ISinkString;
import org.lsfn.console_pc.data_store.sinks.ISinkTrigger;
import org.lsfn.console_pc.data_store.sources.ISourceBoolean;
import org.lsfn.console_pc.data_store.sources.ISourceDouble;
import org.lsfn.console_pc.data_store.sources.ISourceInteger;
import org.lsfn.console_pc.data_store.sources.ISourceListPoint;
import org.lsfn.console_pc.data_store.sources.ISourcePoint;
import org.lsfn.console_pc.data_store.sources.ISourcePolygon;
import org.lsfn.console_pc.data_store.sources.ISourceString;
import org.lsfn.console_pc.data_store.sources.ISourceTrigger;

public class DataStore implements IDataStore {

    private static final int tickInterval = 50;    
    private static final String starshipConnectionPrefix = "starshipConnection/";
    private static final String nebulaConnectionPrefix = "nebulaConnection/";
    private static final String lobbyPrefix = "lobby/";
    private static final String pilotingPrefix = "piloting/";
    private static final String visualSensorsPrefix = "visualSensors/";
    private static final String shipDesignerPrefix = "shipDesigner/";
    
    
    private StarshipConnectionDataStore starshipConnectionDataStore;
    //private NebulaConnectionData nebulaConnectionData;
    //private LobbyData lobbyData;
    //private PilotingData pilotingData;
    //private VisualSensorsData visualSensorsData;
    //private ShipDesignerData shipDesignerData;
    
    public DataStore() {
        this.starshipConnectionDataStore = new StarshipConnectionDataStore();
    }
    
    @Override
    public ISourceBoolean findSourceBoolean(IDataPath dataPath) {
        return null;
    }

    @Override
    public ISourceString findSourceString(IDataPath dataPath) {
        if(dataPath.topLevelMatch(starshipConnectionPrefix)) {
            return this.starshipConnectionDataStore.findSourceString(dataPath.stripTopLevel());
        }
        return null;
    }

    @Override
    public ISourceInteger findSourceInteger(IDataPath dataPath) {
        if(dataPath.topLevelMatch(starshipConnectionPrefix)) {
            return this.starshipConnectionDataStore.findSourceInteger(dataPath.stripTopLevel());
        }
        return null;
    }
    
    @Override
    public ISourceDouble findSourceDouble(IDataPath dataPath) {
        return null;
    }
    
    @Override
    public ISourceTrigger findSourceTrigger(IDataPath dataPath) {
        return null;
    }

    @Override
    public ISourcePolygon findSourcePolygon(IDataPath dataPath) {
        return null;
    }

    @Override
    public ISourceListPoint findSourceListPoint(IDataPath dataPath) {
        return null;
    }

    @Override
    public ISourcePoint findSourcePoint(IDataPath dataPath) {
        return null;
    }

    @Override
    public ISinkBoolean findSinkBoolean(IDataPath dataPath) {
        return null;
    }
    
    @Override
    public ISinkString findSinkString(IDataPath dataPath) {
        if(dataPath.topLevelMatch(starshipConnectionPrefix)) {
            return this.starshipConnectionDataStore.findSinkString(dataPath.stripTopLevel());
        }
        return null;
    }

    @Override
    public ISinkInteger findSinkInteger(IDataPath dataPath) {
        if(dataPath.topLevelMatch(starshipConnectionPrefix)) {
            return this.starshipConnectionDataStore.findSinkInteger(dataPath.stripTopLevel());
        }
        return null;
    }

    @Override
    public ISinkDouble findSinkDouble(IDataPath dataPath) {
        return null;
    }

    @Override
    public ISinkTrigger findSinkTrigger(IDataPath dataPath) {
        return null;
    }

    @Override
    public ISinkPolygon findSinkPolygon(IDataPath dataPath) {
        return null;
    }

    @Override
    public ISinkListPoint findSinkListPoint(IDataPath dataPath) {
        return null;
    }

    @Override
    public ISinkPoint findSinkPoint(IDataPath dataPath) {
        return null;
    }

}
