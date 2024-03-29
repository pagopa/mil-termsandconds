/*
 * ErrorCode.java
 *
 * 12 dec 2022
 */

package it.pagopa.swclient.mil.termsandconds;

/**
 * 
 * @author Antonio Tarricone
 */
public final class ErrorCode {
	public static final String MODULE_ID 								= "004";
	
	public static final String SESSION_ID_MUST_NOT_BE_NULL 				= MODULE_ID + "000001";
	public static final String SESSION_ID_MUST_MATCH_REGEXP 			= MODULE_ID + "000002";
	
	public static final String ERROR_CALLING_SESSION_SERVICE 			= MODULE_ID + "000003";
	public static final String ERROR_CALLING_TOKENIZATOR_SERVICE		= MODULE_ID + "000004";
	
	public static final String ERROR_SESSION_NOT_FOUND_SERVICE			= MODULE_ID + "000005";
	
	public static final String TAX_CODE_MUST_NOT_BE_NULL 				= MODULE_ID + "000006";
	public static final String TAX_CODE_MUST_MATCH_REGEXP 				= MODULE_ID + "000007";
	
	public static final String ERROR_VERSION_NOT_FOUND_SERVICE			= MODULE_ID + "000008";
	public static final String ERROR_VERSION_SERVICE					= MODULE_ID + "000009";
	
	public static final String ERROR_SAVING_SESSION_IN_SESSION_SERVICE	= MODULE_ID + "00000A";
	public static final String ERROR_TIMEOUT_MONGO_DB					= MODULE_ID + "00000B";
	
	public static final String ERROR_CALLING_PW_WALLET_SERVICE			= MODULE_ID + "00000C";
	
	public static final String ERROR_RETRIEVING_TC_VERSION				= MODULE_ID + "00000D";

	private ErrorCode() {
		
	}
}
