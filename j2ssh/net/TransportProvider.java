/*
 *  SSHTools - Java SSH2 API
 *
 *  Copyright (C) 2002 Lee David Painter.
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Library General Public License
 *  as published by the Free Software Foundation; either version 2 of
 *  the License, or (at your option) any later version.
 *
 *  You may also distribute it and/or modify it under the terms of the
 *  Apache style J2SSH Software License. A copy of which should have
 *  been provided with the distribution.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  License document supplied with your distribution for more details.
 *
 */

package com.sshtools.j2ssh.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 *
 * @author $author$
 * @version $Revision: 1.13 $
 */
public interface TransportProvider {
  /**
   *
   *
   * @throws IOException
   */
  public void close() throws IOException;

  //public boolean isConnected();
  public InputStream getInputStream() throws IOException;

  /**
   *
   *
   * @return
   *
   * @throws IOException
   */
  public OutputStream getOutputStream() throws IOException;

  /**
   *
   *
   * @return
   */
  public String getProviderDetail();
}
