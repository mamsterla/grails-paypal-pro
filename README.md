grails-paypal-pro
=================

Fork of the original Grails PayPal-Pro plugin. The original sources are not available, the one in repository are from Grails project cache. If there were any tests, they're lost. Original author does not react, direct contact would be helpful.

My fork solves the malfunction at Grails 2+, which was caused by missing annotation @Validateable at Command objects - reproducable only in PRODUCTION environment, in DEVELOPMENT environment the error does not occur.

Additionally added fixes to use grails.util.Holders rather than ConfiguraitonHolder which was removed in Grails 2.4

This plugin is used in production environment already.
