/**
 * 
 */
package edu.ku.it.si.springjpaexample.action;

import com.opensymphony.xwork2.ActionSupport;

import edu.ku.it.si.springjpaexample.model.Person;
import edu.ku.it.si.springjpaexample.service.PersonService;

/**
 * Controller used to respond to user request 
 * to find a specific Person using the person's
 * employee ID.
 * @author bphillips
 *
 */
public final class PersonFinder extends ActionSupport {


	private static final long serialVersionUID = 1L;
	
	/**
	 * employee ID of the person to find.
	 */
	private Long emplid;
	
	/**
	 * Person found using the emplid.
	 */
	private Person person;
	
	/**
	 * Provides methods to get Person objects.
	 */
	private  transient PersonService personService;
	
	
	@Override
	public String execute()  {
		
		person = personService.findbyEmplid(emplid);
		
		return SUCCESS;
		
	}

	public Long getEmplid() {
		return emplid;
	}

	public void setEmplid(Long emplid) {
		this.emplid = emplid;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	
	
	

}
