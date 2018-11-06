package edu.wmich.cs1120.LA5.MPortis.JWarren;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContactInformationFormatter implements IContactInformationFormatter {

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
			Scanner sc=new Scanner(file);
			formatName(sc.nextLine());
			formatPhoneNumber(sc.nextLine());
			formatEmail(sc.nextLine());
		} catch (FileNotFoundException e) {
			
		} catch (EmailAddressFormatException e) {
			System.out.print(e);
		} catch (PhoneNumberFormatException e) {
			// TODO Auto-generated catch block
		} catch (NameFormatException e) {
			// TODO Auto-generated catch block
		}		
	}

	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatName(String name) throws NameFormatException {
		// TODO Auto-generated method stub
		
	}

}
