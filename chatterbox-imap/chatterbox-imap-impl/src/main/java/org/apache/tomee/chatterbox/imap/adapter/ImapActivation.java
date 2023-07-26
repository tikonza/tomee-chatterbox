/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.tomee.chatterbox.imap.adapter;

/*
 * IronJacamar, a Java EE Connector Architecture implementation
 * Copyright 2013, Red Hat Inc, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
import javax.resource.ResourceException;
import javax.resource.spi.endpoint.MessageEndpointFactory;

/**
 * ImapActivation
 *
 * @version $Revision: $
 */
public class ImapActivation {

    /**
     * The resource adapter
     */
    private ImapResourceAdapter ra;

    /**
     * Activation spec
     */
    private ImapActivationSpec spec;

    /**
     * The message endpoint factory
     */
    private MessageEndpointFactory endpointFactory;

    /**
     * Default constructor
     *
     * @exception ResourceException Thrown if an error occurs
     */
    public ImapActivation() throws ResourceException {
        this(null, null, null);
    }

    /**
     * Constructor
     *
     * @param ra NatSwitchResourceAdapter
     * @param endpointFactory MessageEndpointFactory
     * @param spec NatSwitchActivationSpec
     * @exception ResourceException Thrown if an error occurs
     */
    public ImapActivation(ImapResourceAdapter ra,
            MessageEndpointFactory endpointFactory,
            ImapActivationSpec spec) throws ResourceException {
        System.out.println("MailActivation constructor called...");
        this.ra = ra;
        this.endpointFactory = endpointFactory;
        this.spec = spec;
    }

    /**
     * Get activation spec class
     *
     * @return Activation spec
     */
    public ImapActivationSpec getActivationSpec() {
        System.out.println("ImapActivation getActivationSpec() called...");
        return spec;
    }

    /**
     * Get message endpoint factory
     *
     * @return Message endpoint factory
     */
    public MessageEndpointFactory getMessageEndpointFactory() {
        System.out.println("ImapActivation getMessageEndpointFactory() called...");
        return endpointFactory;
    }

    /**
     * Start the activation
     *
     * @throws ResourceException Thrown if an error occurs
     */
    public void start() throws ResourceException {
        System.out.println("ImapActivation start() called...");
    }

    /**
     * Stop the activation
     *
     */
    public void stop() {
        System.out.println("ImapActivation stop() called...");
    }
}
