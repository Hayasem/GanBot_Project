package me.hayasemcodex.ganbot.events;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MemberJoin extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {

        TextChannel textChannel = event.getGuild().
                getTextChannelById(1168587517344370718L);
        String Username = event.getUser().getName();

        textChannel.sendMessage(Username +
                " veio assinar a papelada! Seja muito bem vindo(a)! ")
                .queue();



    }
}
