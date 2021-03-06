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

package com.sshtools.common.util;

/**
 *
 *
 * @author $author$
 * @version $Revision: 1.12 $
 */
public class JVMUtil {
  /**
   *
   *
   * @return
   */
  public static int getMajorVersion() {
    return 1;
  }

  /**
   *
   *
   * @return
   */
  public static int getMinorVersion() {
    return 4;
  }

  /**
   *
   *
   * @param args
   */
  public static void main(String[] args) {
    System.getProperties().list(System.out);
    System.out.println("Major=" + getMajorVersion());
    System.out.println("Minor=" + getMinorVersion());
  }
}
// end class Base64
