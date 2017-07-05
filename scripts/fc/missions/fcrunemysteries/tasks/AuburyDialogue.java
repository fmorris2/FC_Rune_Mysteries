package scripts.fc.missions.fcrunemysteries.tasks;

import org.tribot.api.interfaces.Positionable;
import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

import scripts.fc.api.interaction.impl.npcs.dialogue.NpcDialogue;
import scripts.fc.api.travel.Travel;
import scripts.fc.framework.task.ItemsRequiredTask;
import scripts.fc.framework.task.Task;

public abstract class AuburyDialogue extends Task implements ItemsRequiredTask
{
	private static final long serialVersionUID = -6436535813848412797L;
	private static final Positionable AUBURY_TILE = new RSTile(3253, 3401, 0);
	private static final RSArea AUBURY_AREA = new RSArea(AUBURY_TILE, 3);
	
	@Override
	public boolean execute()
	{
		if(!AUBURY_AREA.contains(Player.getPosition()))
			return Travel.webWalkTo(AUBURY_TILE);
		
		return new NpcDialogue("Talk-to", "Aubury", 10, 2,0).execute();
	}

}
