package base64;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import org.apache.commons.codec.binary.Base64;

/**
 * this class encodes a binary file to base64 format
 * @author Cleyton
 */
public class Encoder {
	
	public Encoder( ) {
		
	}
	
	
	private void run( ) {
		try {
			FileInputStream fis = new FileInputStream( "resources/boletim.pdf" );
			BufferedInputStream bis = new BufferedInputStream( fis );
			byte[ ] data = new byte[ bis.available( ) ];
			bis.read( data );
			byte[ ] encoded = Base64.encodeBase64( data );
			for ( int k = 0; k < encoded.length; k++ ) {
				System.out.print( ( char ) encoded[ k ] );
			}
			System.out.println( );
			bis.close( );
			fis.close( );
		}
		catch ( IOException e ) {
			e.printStackTrace( );
		}
		
	}
	
	public static void main( String[ ] args ) {
		Encoder obj = new Encoder( );
		obj.run( );
	}

}
