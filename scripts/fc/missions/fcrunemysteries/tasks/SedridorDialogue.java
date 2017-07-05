package scripts.fc.missions.fcrunemysteries.tasks;

import org.tribot.api.interfaces.Positionable;
import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

import scripts.fc.api.interaction.impl.npcs.dialogue.NpcDialogue;
import scripts.fc.api.travel.Travel;
import scripts.fc.framework.task.ItemsRequiredTask;
import scripts.fc.framework.task.Task;

public abstract class SedridorDialogue extends Task implements ItemsRequiredTask
{
	private static final long serialVersionUID = 770220054412694629L;
	private static final Positionable SEDRIDOR_TILE = new RSTile(3104, 9571, 0);
	private static final RSArea SEDRIDOR_AREA = new RSArea(SEDRIDOR_TILE, 7);
	
	@Override
	public boolean execute()
	{
		if(!SEDRIDOR_AREA.contains(Player.getPosition()))
			return Travel.webWalkTo(SEDRIDOR_TILE);
		
		return new NpcDialogue("Talk-to", "Sedridor", 10, 2,0,0).execute();
	}
}
