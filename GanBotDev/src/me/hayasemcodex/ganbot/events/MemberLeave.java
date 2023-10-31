package me.hayasemcodex.ganbot.events;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MemberLeave extends ListenerAdapter {

    @Override
    public void onGuildMemberRemove(GuildMemberRemoveEvent event) {
        TextChannel textChannel = event.getGuild().
                getTextChannelById(1168595206380191814L);
        String Username = event.getUser().getName();

        textChannel.sendMessage("Poxa, parece que " + Username +
                        " perdeu a papelada no caminho, uma pena que fechamos!")
                .queue();



    }
}

