package me.hayasemcodex.ganbot.main;
import me.hayasemcodex.ganbot.events.MemberJoin;
import me.hayasemcodex.ganbot.commands.Ping;
import me.hayasemcodex.ganbot.events.MemberLeave;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.requests.GatewayIntent;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class GanBot {
    public static JDA jda;
    public static Map<Long, String> mapguildname = new HashMap<>();


    public static void main(String[] args){


    //Código para instanciar todas as intents da GanBot
        jda = JDABuilder.create(
                "MTE2ODUzMzAyMjA0ODUzODY4NA.GjF1SS.H-aexm6M6gvshSMSlzBwsSeI_Zu34g_bLEhYlI",
                EnumSet.allOf(GatewayIntent.class)).build();

        jda.addEventListener(new Ping());
        jda.addEventListener(new MemberJoin());
        jda.addEventListener(new MemberLeave());


        for(Guild guild: jda.getGuilds()){

            mapguildname.put(guild.getIdLong(), guild.getName());

            System.out.println(mapguildname.get(guild.getIdLong()));
        }
    }
}