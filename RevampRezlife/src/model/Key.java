package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public abstract class Key extends Item{
	protected boolean transferable;

	public Key(String item_name, ItemState item_state, Integer late_fee_charge, Integer item_id) {
		super(item_name, item_state, late_fee_charge, item_id);
	}
	
	public boolean modifyKey(String Id, String tempNum){
		//readTempInfoFromFile(tempNum);
		return true;
	}
	
	private void readTempInfoFromFile(String tempNum){
		String line;
		String file = TemporaryKey.storageFileName;
		boolean found;
		int i = 0;
		try{
			FileReader fr = new FileReader(TemporaryKey.storageFileName);
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) != null){
				found = split(line, tempNum);
				if(found == true){
					removeNthLine(file, i);
					break;
				}
				else{
					i = i + 1;
				}
				System.out.println(line);
			}
			fr.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public boolean split(String line, String tempNum){
		boolean found = line.contains(tempNum);
		return found;
	}
	public void update(String line){
		//write to file
	}
	public boolean validateIdentity(ResidentProfile resident){
		return false;
	}
	
	public boolean isTransferable() {
		return transferable;
	}
	
	public static void removeNthLine(String f, int toRemove) throws IOException{
	    RandomAccessFile raf = new RandomAccessFile(f, "rw");
	    // Leave the n first lines unchanged.
	    for (int i = 0; i < toRemove; i++)
	        raf.readLine();

	    // Shift remaining lines upwards.
	    long writePos = raf.getFilePointer();
	    raf.readLine();
	    long readPos = raf.getFilePointer();

	    byte[] buf = new byte[1024];
	    int n;
	    while (-1 != (n = raf.read(buf))) {
	        raf.seek(writePos);
	        raf.write(buf, 0, n);
	        readPos += n;
	        writePos += n;
	        raf.seek(readPos);
	    }
	    raf.setLength(writePos);
	    raf.close();
	}
	

}
