package scripts.fc.missions.fcrunemysteries.tasks;

import org.tribot.api.interfaces.Positionable;
import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

import scripts.fc.api.interaction.impl.npcs.dialogue.NpcDialogue;
import scripts.fc.api.travel.Travel;
import scripts.fc.framework.task.SpaceRequiredTask;
import scripts.fc.framework.task.Task;
import scripts.fc.missions.fcrunemysteries.data.RMSettings;

public class DukeHoracioDialogue extends Task implements SpaceRequiredTask
{
	private static final long serialVersionUID = 7683285099997787402L;
	private static final Positionable DUKE_TILE = new RSTile(3210, 3222, 1);
	private static final RSArea DUKE_AREA = new RSArea(DUKE_TILE, 5);
	
	@Override
	public boolean execute()
	{
		if(!DUKE_AREA.contains(Player.getPosition()))
			return Travel.webWalkTo(DUKE_TILE);
			
		return new NpcDialogue("Talk-to", "Duke Horacio", 10, 0, 0).execute();
	}

	@Override
	public boolean shouldExecute()
	{
		return RMSettings.DUKE_HORACIO_DIALOGUE.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Duke Horacio Dialogue";
	}

	@Override
	public int getSpaceRequired()
	{
		return 1;
	}

}
