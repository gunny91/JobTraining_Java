package pkg13;

/**
 * It called Java Bean(JSP) DTO(Data Transfer Object), VO(Value Object)
 * @author GeonHee Cho
 *
 */
public class PresidentCandidates {
	//name, party, pop rates
	private String name;
	private String party;
	private double rates;
	
	PresidentCandidates(){}
	/**
	 * Constructor for Candidates
	 * @param name name of candidates
	 * @param party name of party
	 * @param rates rate for support
	 */
	PresidentCandidates(String name, String party, double rates)
	{
		this.name =name;
		this.party =party;
		this.rates = rates;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getRates()
	{
		return rates;
	}
	
	public String getParty()
	{
		return party;
	}
	
	
}
