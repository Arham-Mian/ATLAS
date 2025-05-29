Day 1 : 14/04/2024 : Arham Mian : aarhammi@amazon.com

=============================================================================

------------------------------SDLC CONCEPTS----------------------------------

=============================================================================

Task 1: What is SDLC?

SDLC (Software Development Life Cycle) is a structured process used by software engineers and organizations to design, develop, test, and deploy software.
It defines steps involved from idea to final product, ensuring that the software meets technical and user requirements.

=============================================================================

Task 2: Why is SDLC Important?

* Ensures quality and consistency in software development.
* Helps manage time, cost, and scope of a project.
* Reduces risks of failure or rework.
* Makes collaboration easier among developers, testers, managers, and clients.
* Enables early detection of issues through reviews and testing phases.

=============================================================================

Task 3: What Are the Stages of SDLC?

Here are the main stages (can vary slightly based on model used):

| Stage                      | Description                                           |
| -------------------------- | ----------------------------------------------------- |
| 1. Requirement Analysis    | Gather and analyze what users need from the software. |
| 2. Planning                | Define the scope, cost, timeline, and resources.      |
| 3. System Design           | Architect the software (UI, backend, database, etc.)  |
| 4. Implementation (Coding) | Developers write the actual source code.              |
| 5. Testing                 | QA teams test the software to find and fix bugs.      |
| 6. Deployment              | Release the product to users.                         |
| 7. Maintenance             | Fix future bugs and update the software over time.    |

=============================================================================

Task 4: SDLC Models — List, Description, and Images

1. Waterfall Model

Description:

* Sequential and linear model.
* Each phase must be completed before the next begins.
* Easy to understand and manage.
* Not flexible for changing requirements.

Use Case: Small projects with well-defined requirements.

Image:

![Waterfall Model](https://www.tutorialspoint.com/sdlc/images/waterfall_model.jpg)



2. V-Model (Validation & Verification)

Description:

* Extension of the waterfall model with a focus on testing.
* Each development phase has a corresponding testing phase.
* Good for projects requiring high quality and strict testing.
* Very rigid like Waterfall.

Use Case: Healthcare, aerospace, embedded systems.

Image:

![V-Model](https://www.geeksforgeeks.org/wp-content/uploads/V-Model-in-Software-Testing.png)


3. Incremental Model

Description:

* Software is built and delivered in small parts (increments).
* Each increment adds new features.
* Easier to test and manage risk.
* Feedback is possible after each release.

Use Case:Medium to large projects where core features need quick delivery.

Image:

![Incremental Model](https://static.javatpoint.com/tutorial/software-engineering/images/incremental-model1.png)

4. Iterative Model

Description:

* Build a basic version and improve it through repeated cycles (iterations).
* Each iteration enhances functionality based on feedback.
* Helps in refining unclear requirements.

Use Case: Startups and evolving projects.

Image:

![Iterative Model](https://static.javatpoint.com/tutorial/software-engineering/images/iterative-model1.png)


5. Agile Model

Description:

* Flexible and fast-paced approach.
* Development occurs in sprints (2–4 weeks) with constant feedback.
* High customer collaboration.
* Great for projects with frequent requirement changes.

Use Case: Modern web/mobile apps, startups, user-focused projects.

Image:

![Agile Model](https://agilemanifesto.org/agile-process.png)


6. Spiral Model

Description:

* Combines Waterfall + Iterative + Risk Analysis.
* Development is in loops (spirals) — each loop addresses risks.
* Ideal for high-risk and complex projects.
* Very flexible but expensive.

Use Case: Defense, large ERP systems, R\&D projects.

Image:

=============================================================================

---------------------------NETWORKING CONCEPT--------------------------------

=============================================================================

Task 5: What are the different Network types?

1. LAN (Local Area Network): A network confined to a small geographic area, like a home or office, typically using Ethernet or Wi-Fi.

2. WAN (Wide Area Network): A large-scale network that spans a broad geographic area, connecting multiple LANs, often using leased lines or satellite links.

3. MAN (Metropolitan Area Network): A network that covers a city or large campus, larger than a LAN but smaller than a WAN, often using fiber optics.

4. PAN (Personal Area Network): A small network, usually within a range of a few meters, connecting personal devices like smartphones and laptops.

5. CAN (Campus Area Network): A network that connects networks across multiple buildings within a campus, such as a university or business campus.


Task 6: What are the types of servers?

1. Web Server: Hosts websites and serves web pages to users via browsers.

2. Database Server: Provides database services to other computers or programs within a network.

3. File Server: Manages and stores files, allowing other devices on the network to access them.

4. Mail Server: Handles and manages the sending and receiving of emails.

5. Proxy Server: Acts as an intermediary between a client and a server, often used for security or caching purposes.

6. DNS Server: Resolves domain names to IP addresses, enabling browsers to load internet resources.

7. FTP Server: Facilitates the transfer of files over the File Transfer Protocol.

8. Application Server: Hosts and runs applications, providing services to client applications.


Task 7: What do you know about DNS?

The Domain Name System (DNS) is a hierarchical system that translates human-readable domain names (like [www.example.com](http://www.example.com)) into IP addresses (like 192.168.1.1). This process allows browsers to load internet resources by converting domain names into machine-readable IP addresses.


Task 8: What is TCP and UDP? What is the difference?

* TCP (Transmission Control Protocol): A connection-oriented protocol that ensures reliable data transmission with error checking and correction. It's used for applications where data integrity is critical, like web browsing and email.

* UDP (User Datagram Protocol): A connectionless protocol that sends data without establishing a connection, offering faster transmission but without guaranteed delivery. It's suitable for applications like video streaming and online gaming.

Differences:

| Feature     | TCP                                | UDP                             |
| ----------- | ---------------------------------- | ------------------------------- |
| Connection  | Connection-oriented                | Connectionless                  |
| Reliability | Reliable with error correction     | Unreliable, no error correction |
| Speed       | Slower due to overhead             | Faster due to minimal overhead  |
| Use Cases   | Web browsing, email, file transfer | Streaming, gaming, VoIP         |



Task 9: What do you know about MAC address? What is the difference between MAC address and IP address?

* MAC Address: A unique identifier assigned to network interfaces for communications on the physical network segment. It's used for local network communication and is assigned by the device manufacturer.

* IP Address: A logical address assigned to devices for identifying and locating them on a network. It can be assigned dynamically and is used for routing data across networks.

Differences:

| Feature    | MAC Address                 | IP Address                                |
| ---------- | --------------------------- | ----------------------------------------- |
| Layer      | Data Link Layer (Layer 2)   | Network Layer (Layer 3)                   |
| Assignment | Assigned by manufacturer    | Assigned by network administrator or DHCP |
| Permanence | Typically permanent         | Can change (dynamic IP)                   |
| Scope      | Local network communication | Global network communication              |



Task 10: What is OSI model?

The OSI (Open Systems Interconnection) model is a conceptual framework used to understand network interactions in seven layers:

1. Physical Layer: Deals with the physical connection between devices.
2. Data Link Layer: Provides node-to-node data transfer and handles error correction.
3. Network Layer: Determines how data is sent to the receiver from the sender.
4. Transport Layer: Ensures complete data transfer with error correction and flow control.
5. Session Layer: Manages sessions between applications.
6. Presentation Layer: Translates data formats between the application and transport layers.
7. Application Layer: Provides network services directly to end-users.



Task 11: What is an IPv4 address? What are the different classes of IPv4?

An IPv4 address is a 32-bit address used to identify devices on a network, typically written in dotted decimal format (e.g., 192.168.1.1).

Classes of IPv4:

* Class A: Supports 16 million hosts on each of 128 networks.
* Class B: Supports 65,000 hosts on each of 16,000 networks.
* Class C: Supports 254 hosts on each of 2 million networks.
* Class D: Reserved for multicast groups.
* Class E: Reserved for experimental purposes.



Task 12: What are the advantages of using VPN?

1. Enhanced Security: Encrypts internet traffic, protecting data from hackers.
2. Privacy Protection: Hides your IP address, safeguarding your identity.
3. Access Restricted Content: Allows access to geo-blocked websites and services.
4. Safe Public Wi-Fi Use: Protects data when connected to unsecured networks.



Task 13: Types of VPN

1. Access VPN: Connects individual users to a remote network securely.
2. Site-to-Site VPN: Connects entire networks to each other over the internet.
3. Intranet VPN: Connects multiple internal networks within an organization.
4. Extranet VPN: Connects an organization's internal network to external networks, like partners.


Task 14: Node and Link

* Node: A device or data point in a network, such as a computer or router.
* Link: The communication pathway that connects nodes in a network.


Task 15: Topology means

Topology refers to the arrangement or layout of elements (links, nodes, etc.) in a computer network. It defines how different network devices and components are connected and how data flows within the network.



Task 16: Different types of network topology

1. Bus Topology: All devices share a single communication line; simple but can be slow.
2. Star Topology: All devices are connected to a central hub or switch; easy to manage.
3. Ring Topology: Devices are connected in a circular fashion; data travels in one direction.
4. Mesh Topology: Devices are interconnected; provides high redundancy.
5. Hybrid Topology: Combination of two or more topologies; flexible and scalable.



Task 17: What is extended bus topology? It's Tree Topology.

* Extended Bus Topology: This is an enhanced version of the basic bus topology where additional nodes are connected to the main bus via secondary lines. It helps to expand the network without much reconfiguration.
* Tree Topology: A hybrid structure combining characteristics of star and bus topologies. It has a root node and branching hierarchical nodes, making it scalable and suitable for large networks like universities.



Task 18: What is the use of a router and how is it different from a gateway?

* Router: A device that routes data packets between different networks. It connects multiple networks and directs network traffic efficiently.
* Gateway: A network node that acts as a translator between different protocols or network architectures.

Difference:

* Routers operate within similar networks (e.g., two IP networks).
* Gateways connect dissimilar networks (e.g., IP to ATM).


Task 19: Explain SMTP Protocol with diagram.

* SMTP (Simple Mail Transfer Protocol) is a protocol used to send emails from a client to a server or between servers.
* It works over port 25 and uses a push mechanism to deliver emails to the recipient’s server.
* A basic flow:
  Email Client (Outlook/Gmail) → SMTP Server → Recipient's SMTP Server → Recipient’s Inbox
  

Task 20: Differentiate between OSI and TCP/IP

| Feature     | OSI Model               | TCP/IP Model                   |
| ----------- | ----------------------- | ------------------------------ |
| Layers      | 7 Layers                | 4 Layers                       |
| Approach    | Theoretical/Conceptual  | Practical/Implementation-based |
| Development | Developed by ISO        | Developed by DARPA             |
| Usage       | General reference model | Used in real-world internet    |

OSI: Application, Presentation, Session, Transport, Network, Data Link, Physical
TCP/IP: Application, Transport, Internet, Network Access



Task 21: HTTP and HTTPS

* HTTP (Hypertext Transfer Protocol): Used for transferring data over the web. Data is not encrypted.
* HTTPS (HTTP Secure): An extension of HTTP with encryption via SSL/TLS. Used for secure communication (banking, login pages, etc.).



Task 22: What is Low Level Design and High Level Design? Explain.

* High Level Design (HLD): Provides a broad view of the system architecture. Includes modules, data flow, technology stack, etc. It’s like a blueprint.
* Low Level Design (LLD): Focuses on the detailed design of individual components/modules. Includes class diagrams, pseudo code, logic flows, etc.

Example:

* HLD: "We will use a three-tier architecture with a web frontend, middleware, and a MySQL database."
* LLD: "Class ‘User’ will have attributes: name, email, password, and methods: login(), register()."



Task 23: What is SRS (Software Requirement Specification)?

* SRS is a document that describes what the software will do and how it will be expected to perform.
* It includes functional requirements, non-functional requirements, use cases, and constraints.
* It serves as a blueprint for the development team to understand user needs and system expectations.

Example diagram (basic):
User → SRS → Design Team → Developers


