package edu.wmich.cs1120.LA5.MPortis.JWarren;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContactInformationFormatter implements IContactInformationFormatter {

	private String phoneNumber;
	private String name;
	private String email;
	
	@Override
	public void readContactInformation(String[] filePaths) {
		for(int i=0; i<filePaths.length;i++) {
			formatContactInformation(filePaths[i]);
		
		}
	}

	@Override
	public void formatContactInformation(String fileName) {
		File file= new File(fileName);

			try {
				Scanner sc = new Scanner(file);
				name=sc.nextLine();
				phoneNumber=sc.nextLine();
				email=sc.nextLine();
				sc.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			yeet
	}

	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
		
	}

	@Override
	public void formatName(String name) throws NameFormatException {
		// TODO Auto-generated method stub
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
