# hel.language
HEL language specification and compiler

Designing a language for agentic AI that is as close as possible to natural English involves creating a syntax and semantics that are easy for humans to understand and for machines to process. The language should balance simplicity with expressiveness, allowing users to communicate complex tasks without needing to learn a completely new system. Here’s a conceptual approach to how such a language could look:

Key Features:
Simple and Intuitive Syntax: Use plain English phrases.
Context Awareness: Support for context to understand references and follow-up commands.
Modularity and Extensibility: Ability to define and reuse tasks.
Error Handling: Clear ways to specify and handle potential errors or exceptions.
Interactivity: Support for dialogues, where the agent can ask clarifying questions.
Example Syntax and Usage:
Basic Commands:

Fetch the latest news headlines.
This command is straightforward and instructs the agent to perform a single action.

Conditional Statements:

If it is raining, remind me to take an umbrella.
Here, the language uses a conditional structure that is easy to understand.

Loops and Repetition:

Every morning at 7 AM, give me a summary of today's weather and my calendar events.
This example shows how to set up a recurring task using natural language.

Variables and References:

Remember that my favorite color is blue. Use this color for the background of my reports.
This demonstrates storing a preference and using it later.

Error Handling:

Send an email to John. If it fails, notify me immediately.
The command includes an action and a way to handle failure.

Interactive Dialogue:

User: Book a table at an Italian restaurant for tonight.
Agent: What time would you like the reservation?
User: 7 PM.
Agent: How many people will be attending?
User: Four.
This interaction shows the agent asking clarifying questions to complete the task.

Example Session:
Complex Task with Subtasks:

Plan my trip to New York.
- Book a flight for next Friday.
- Reserve a hotel room near Central Park.
- Schedule meetings with clients on Monday and Tuesday.
The agent breaks down the complex task into manageable subtasks.

Using Context:

User: What's the weather like?
Agent: It's sunny and 75 degrees.
User: Great, then schedule a picnic for tomorrow afternoon.
The agent uses the context of the previous conversation to understand the new command.

Modular and Reusable Tasks:

Define my morning routine.
- At 6:30 AM, wake me up with my favorite song.
- At 6:35 AM, give me a summary of today's news.
- At 6:45 AM, remind me to exercise.

Execute my morning routine.
Conclusion:
A language for agentic AI that closely resembles natural English would need to support clear, intuitive commands, handle context and follow-up questions, manage conditions and errors, and allow for the definition and reuse of routines. By mimicking the structure and vocabulary of natural language, it can make interaction with AI more accessible and efficient for users.

## HEL Grammar

Explanation
Lexer Rules: These rules define the basic tokens like whitespace (WS), words (WORD), numbers (NUMBER), time format (TIME), and string literals (STRING).

Keywords: These are specific words used in HEL for various commands.

Parser Rules: These define the structure of commands in HEL.

command: The top-level rule that can match any type of command.

simpleCommand: Matches simple commands like fetching information, scheduling, booking, and sending messages.

conditionalCommand: Matches conditional commands using "If".

loopCommand: Matches commands that repeat using "Every".

rememberCommand: Matches commands that store information using "Remember".

errorHandlingCommand: Matches commands with error handling using "If fails, notify".

interactiveCommand: Matches interactive dialogues.

dialog and dialogStep: Define the structure of dialogues with multiple steps.

condition: A helper rule for matching conditions.






