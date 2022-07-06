| User               | Notes                    | Relationships |
|--------------------|--------------------------|---------------|
| `Long id;`         | PK                       | 
| `String username;` |
| `String email;`    |
| `String password;` | encrypted before saving  | 
| `Role role;`       | FK; collection? strings? | Many to Many  | 

| Role               | Notes | Relationships |
|--------------------|-------|---------------|
| `Long id;`         | PK    |
| `String roleName;` |

| Status         | Notes | Relationships |
|----------------|-------|---------------|
| `Long id;`     | PK    |
| `String status | 

 
| Project              | Notes                | Relationships       |
|----------------------|----------------------|---------------------|
| `Long id;`           | PK                   | 
| `String title;`      |
| `Sting description;` |
| `User manager;`      | FK? connected entity | Many (P) to One (M) |
| `User developer;`    | FK? connected entity | Many to Many        |
| `Ticket ticket;`     | FK                   | One (P) to Many (T) |
| `Status status;`     | FK?                  | Many (P) to One (S) |

| Ticket                   | Notes | Relationships       |
|--------------------------|-------|---------------------|
| `Long id;`               | PK    | 
| `String title;`          | 
| `String details;`        |
| `User owner;`            | FK    | Many (T) to One (O) |
| `User developer;`        | FK    | Many (T) to One (D) |
| `Comment comment;`       | FK    | One (T) to Many (C) |
| `Attachment attachment;` | FK    | One (T) to Many (A) |
| `Change change;`         | FK    | One (T) to Many (C) |
| `Status status;`         | FK    | Many (T) to One (S) |

| Comment               | Notes | Relationships       |
|-----------------------|-------|---------------------|
| `Long id;`            | PK    |
| `String title;`       | 
| `String commentBody;` | 
| `User commenter;`     | FK    | Many (C) to One (U) |
| `Ticket ticket;`      | FK    | Many (C) to One (T) |

| Attachment               | Notes | Relationships       |
|--------------------------|-------|---------------------|
| `Long id;`               | PK    |
| `String title;`          |
| `String attachmentBody;` |
| `User poster;`           | FK    | Many (A) to One (P) |
| `Ticket ticket;`         | FK    | Many (A) to One (T) |
