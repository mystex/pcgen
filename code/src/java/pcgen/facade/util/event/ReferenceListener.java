/*
 * ReferenceListener.java
 * Copyright 2010 Connor Petty <cpmeister@users.sourceforge.net>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 * 
 * Created on Apr 25, 2010, 3:32:17 PM
 */

package pcgen.facade.util.event;

import java.util.EventListener;

/**
 * 
 * @author Connor Petty &lt;cpmeister@users.sourceforge.net&gt;
 */
@FunctionalInterface
public interface ReferenceListener<E> extends EventListener
{
	void referenceChanged(ReferenceEvent<E> e);
}
