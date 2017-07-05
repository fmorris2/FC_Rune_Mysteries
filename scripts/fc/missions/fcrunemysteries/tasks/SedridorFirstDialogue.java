package scripts.fc.missions.fcrunemysteries.tasks;

import scripts.fc.api.items.FCItem;
import scripts.fc.missions.fcrunemysteries.FCRuneMysteries;
import scripts.fc.missions.fcrunemysteries.data.RMSettings;

public class SedridorFirstDialogue extends SedridorDialogue
{
	private static final long serialVersionUID = 7868340830188672025L;

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(1, false, FCRuneMysteries.AIR_TALISMAN)
		};
	}

	@Override
	public boolean shouldExecute()
	{
		return RMSettings.SEDRIDOR_FIRST_DIALOGUE.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Sedridor first dialogue";
	}

}
