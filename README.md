# simple-vulnerable-app

A small Spring Boot app with intentional weaknesses. It exists to test the SAST patch loop
(scan, AI patch, offline compile) on code that is easy to fix. Do not deploy it.

| Weakness | Endpoint | Sink |
|---|---|---|
| SQL injection (CWE-89) | `GET /api/users/emails?username=` | `UserService.findEmails` |
| Command injection (CWE-78) | `GET /api/ping?host=` | `PingService.ping` |
| Path traversal (CWE-22) | `GET /api/reports?name=` | `FileService.readReport` |
| XXE (CWE-611) | `POST /api/xml/root` | `XmlService.rootName` |

Build: `mvn compile` (Java 17 or newer).
