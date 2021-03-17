public class RoachPopulation {
/*
 * Set the instance variable for the class as a double
 */
	private double population = 0;
/*
 * Construct with an input population
 */
	public RoachPopulation(double startingpop) 
	{
		this.population = startingpop;
	}
	/*
	 * Breed method doubles the population
	 */
	public void breed() 
	{
		population = population * 2;
	}
	/*
	 * Spray method that cuts the population by an input percent
	 */
	public void spray(double sprayPct ) 
	{
		population = population -(population * sprayPct);
		
	}
	/*
	 * Returns the roach population
	 */
	public double getRoach() 
	{
		return population;
	}
}
