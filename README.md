# Full-Stack Bug Tracker

## Description

TBD

## Features/SRS
**Authorization**
* Register as a user/Login
* Access as demo user

**Functionality**
* Create projects (project managers or admin only)
* Assign/unassign users to/from projects (project managers or admin only)
* Create tickets
* Assign tickets to user
* Edit submitted tickets
* Create ticket comments
* Create ticket attachments
* List comments/attachments per ticket
* List history of ticket changes
* List tickets: 
  * by owner (creator)
  * by assignment (dev assigned)
  * by project
* Filter ticket list by:
  * ticket type
  * priority
  * status
  * creation date/time
* Sort ticket list by:
  * title
  * owner
  * assignment
  * creation or recent update date/time
  * ticket type
  * priority
  * status
  * project
* Full text search

**UI**
* Landing
  * links to login and register, include button to login as guest or demo (needs admin rights for demo purposes)
* Login/Register
  * users can login, register, recover lost password
  * optional: register/login from social networks
* Dashboard
  * all users directed here upon login
  * displays: 
    * TBD
  * optional: display data visualization of ticket types logged and resolved per project
* Role Management
  * admin users must have access to an interface for assigning users to and removing users from roles:
    * Admin
    * Project Manager
    * Developer
    * Submitter
  * roles should be seeded in database with global admin
* Ticket Management
  * paged listing of ticket items (min 10/page)
  * users have access to ticket lists based on role:
    * submitters see tickets which they own
    * devs see tickets to which they are assigned
    * project managers see tickets belonging to the projects for which they are responsible
    * admins see all tickets
  * tickets may be created and edited, not deleted. completed tickets receive "resolved" status
  * ticket details page used to provide full detailed ticket history for each ticket
  * ticket statuses, types, priorities seeded in database
  * provide interfaces for adding comments and attachments
  * devs should be notified via email or other messaging service when assigned a new ticket 
* Project Management
  * projcet managers and admins must have access to an interface for creating projects
  * project managers must have access to an interface for assigning users to and removing users from a project
* User Profile
  * change password
  * edit profile info
  * associate profile with social network identities

---
### Notes
* create progress log
* look into `JavaMailSender` dependency in Spring for notification email system

---
#### Progress Log
1. Project initialized with Spring initializer. Configuration completed in `application.properties`. Created ReadMe. Created empty database in pgArmin. 
   * commit 12:43 PM 7/4/2022