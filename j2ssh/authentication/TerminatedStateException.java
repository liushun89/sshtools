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

package com.sshtools.j2ssh.authentication;

/**
 *
 *
 * @author $author$
 * @version $Revision: 1.14 $
 */
public class TerminatedStateException
    extends Exception {
  private int state;

  /**
   * Creates a new TerminatedStateException object.
   *
   * @param state
   */
  public TerminatedStateException(int state) {
    this.state = state;
  }

  /**
   *
   *
   * @return
   */
  public int getState() {
    return state;
  }
}
