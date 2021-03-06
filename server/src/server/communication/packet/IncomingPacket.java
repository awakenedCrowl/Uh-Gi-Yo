package server.communication.packet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jk0521 on 10.03.2017.
 */
public abstract class IncomingPacket extends Packet {
    private static List<Class<? extends IncomingPacket>> packetTypes = new ArrayList<Class<? extends IncomingPacket>>();

    public static void registerPacketType(Class<? extends IncomingPacket> packetType) {
        if(!packetTypes.contains(packetType))
            packetTypes.add(packetType);
    }

    public abstract void handlePacket();
}
