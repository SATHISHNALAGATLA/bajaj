# Bajaj Finserv Health | Qualifier 1 (JAVA)

This app auto-runs on startup to:
1) Call generateWebhook (get webhook + JWT accessToken)
2) Load your final SQL
3) Submit it to the webhook with Authorization: Bearer <token>

## How to Use

```bash
mvn -q -