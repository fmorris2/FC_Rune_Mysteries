package scripts.fc.missions.fcrunemysteries.tasks;

import org.tribot.api2007.Player;

import scripts.fc.api.interaction.impl.npcs.dialogue.NpcDialogue;
import scripts.fc.api.items.FCItem;
import scripts.fc.api.travel.Travel;
import scripts.fc.missions.fcrunemysteries.data.RMSettings;

public class SedridorSecondDialogue extends SedridorDialogue
{
	private static final long serialVersionUID = -3748782454008437022L;

	@Override
	public boolean execute()
	{
		if(!SEDRIDOR_AREA.contains(Player.getPosition()))
			return Travel.webWalkTo(SEDRIDOR_TILE);
		
		return new NpcDialogue("Talk-to", "Sedridor", 10, 0).execute();
	}
	
	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]{};
	}

	@Override
	public boolean shouldExecute()
	{
		return RMSettings.SEDRIDOR_SECOND_DIALOGUE.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Sedridor second dialogue";
	}

}
