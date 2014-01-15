/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

/**
* Contains an SSH key pair to be installed on the virtual machine.
*/
public class SshSettingKeyPair
{
    private String fingerprint;
    
    /**
    * Required. Specifies the SHA1 fingerprint of an X509 certificate
    * associated with the hosted service that includes the SSH keypair.
    */
    public String getFingerprint()
    {
        return this.fingerprint;
    }
    
    /**
    * Required. Specifies the SHA1 fingerprint of an X509 certificate
    * associated with the hosted service that includes the SSH keypair.
    */
    public void setFingerprint(String fingerprint)
    {
        this.fingerprint = fingerprint;
    }
    
    private String path;
    
    /**
    * Required. Specifies the full path of a file, on the virtual machine,
    * which stores the SSH private key. The file is overwritten when multiple
    * keys are written to it. The SSH public key is stored in the same
    * directory and has the same name as the private key file with .pub
    * suffix.  Example: /home/user/.ssh/id_rsa
    */
    public String getPath()
    {
        return this.path;
    }
    
    /**
    * Required. Specifies the full path of a file, on the virtual machine,
    * which stores the SSH private key. The file is overwritten when multiple
    * keys are written to it. The SSH public key is stored in the same
    * directory and has the same name as the private key file with .pub
    * suffix.  Example: /home/user/.ssh/id_rsa
    */
    public void setPath(String path)
    {
        this.path = path;
    }
}
