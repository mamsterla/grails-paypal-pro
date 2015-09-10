/* Copyright 2009-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For more information please visit www.solution51.com
 * or email info@solution51.com
 * Author: Peter Delahunty
 * Email: peter.delahunty@solution51.com
 * Date: 26-May-2009
*/

class PaypalProGrailsPlugin {
    def version = "0.3.0"
    def grailsVersion = "2.0 > *"
    def title = "Paypal Pro"
    def author = "Peter Delahunty"
    def authorEmail = "peter.delahunty@solution51.com"
    def description = '''This plugin encapsulates paypal NVP calls to a web payments pro account. It enables you to take payment from a user without the user ever leaving your website.
It is NOT a replacement for the existing Grails paypal plugin'''
    def documentation = "http://grails.org/plugin/paypal-pro"
    def license = "APACHE"
    def issueManagement = [url: 'https://github.com/mamsterla/grails-paypal-pro/issues']
    def scm = [url: 'https://github.com/mamsterla/grails-paypal-pro']
}
