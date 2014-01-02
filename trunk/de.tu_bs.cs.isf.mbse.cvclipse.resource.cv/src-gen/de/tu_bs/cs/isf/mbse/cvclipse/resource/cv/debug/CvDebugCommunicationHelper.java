/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug;

public class CvDebugCommunicationHelper {
	
	public void sendEvent(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage sendAndReceive(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage receivedMessage = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
